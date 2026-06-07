import java.util.*;

// ----------------- Chunk structure -----------------
class Chunk {
    String text;
    double[] embedding;

    Chunk(String text, double[] embedding) {
        this.text = text;
        this.embedding = embedding;
    }
}

public class SimpleRAG {

    // 1. Normalize text
    static String normalize(String text) {
        return text.toLowerCase()
                .replaceAll("[^a-z0-9 ]", " ")
                .replaceAll("\\s+", " ")
                .trim();
    }

    // 2. Split into chunks
    static List<String> chunk(String text, int size) {
        List<String> chunks = new ArrayList<>();

        for (int i = 0; i < text.length(); i += size) {
            chunks.add(text.substring(i, Math.min(i + size, text.length())));
        }

        return chunks;
    }

    // 3. Fake embedding (simulation)
    static double[] embed(String text) {
        double[] v = new double[5];

        for (int i = 0; i < text.length() && i < 5; i++) {
            v[i] = text.charAt(i) % 10;
        }

        return v;
    }

    // 4. Cosine similarity
    static double cosine(double[] a, double[] b) {

        double dot = 0, normA = 0, normB = 0;

        for (int i = 0; i < a.length; i++) {
            dot += a[i] * b[i];
            normA += a[i] * a[i];
            normB += b[i] * b[i];
        }

        return dot / (Math.sqrt(normA) * Math.sqrt(normB));
    }

    // 5. Retrieve top matching chunk
    static String retrieve(List<Chunk> store, double[] queryEmbedding) {

        double maxScore = -1;
        String bestChunk = "";

        for (Chunk c : store) {

            double score = cosine(c.embedding, queryEmbedding);

            if (score > maxScore) {
                maxScore = score;
                bestChunk = c.text;
            }
        }

        return bestChunk;
    }

    public static void main(String[] args) {

        // ---------------- Step 1: Document ----------------
        String doc = "RAG is Retrieval Augmented Generation. It helps AI use external knowledge.";

        // ---------------- Step 2: Normalize ----------------
        doc = normalize(doc);

        // ---------------- Step 3: Chunk ----------------
        List<String> chunks = chunk(doc, 30);

        // ---------------- Step 4: Store embeddings ----------------
        List<Chunk> store = new ArrayList<>();

        for (String c : chunks) {
            store.add(new Chunk(c, embed(c)));
        }

        // ---------------- Step 5: Query ----------------
        String query = normalize("what is rag?");
        double[] queryEmbedding = embed(query);

        // ---------------- Step 6: Retrieve ----------------
        String result = retrieve(store, queryEmbedding);

        // ---------------- Step 7: Output ----------------
        System.out.println("Answer from RAG:");
        System.out.println(result);
    }
}
