//CosineSimilarity
public class DSA41 {

    public static double cosineSimilarity(double[] a, double[] b) {

        double dotProduct = 0.0;
        double normA = 0.0;
        double normB = 0.0;

        for (int i = 0; i < a.length; i++) {
            dotProduct += a[i] * b[i];   // A · B
            normA += a[i] * a[i];        // |A|^2
            normB += b[i] * b[i];        // |B|^2
        }

        return dotProduct / (Math.sqrt(normA) * Math.sqrt(normB));
    }

    public static void main(String[] args) {

        double[] v1 = {1, 2, 3};
        double[] v2 = {4, 5, 6};

        double result = cosineSimilarity(v1, v2);

        System.out.println("Cosine Similarity: " + result);
    }
}