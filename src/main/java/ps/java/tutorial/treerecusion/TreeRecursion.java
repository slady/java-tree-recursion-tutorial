package ps.java.tutorial.treerecusion;

import java.io.File;

public class TreeRecursion {

    public static void main(final String... a) {
        final File root = new File(".");
        tree("", "", root);
//        tree("", "", new File("/"));
    }

    private static void tree(final String namePrefix, final String treePrefix, final File file) {
        System.out.println(namePrefix + file.getName());
        final File[] files = file.listFiles(File::isDirectory);

        if (files == null) {
            return;
        }

        final int length = files.length;

        for (int i = 0; i < length; i++) {
            final File f = files[i];

            if (i < length - 1) {
                tree(treePrefix + " +", treePrefix + " |", f);
            } else {
                tree(treePrefix + " `", treePrefix + "  ", f);
            }
        }
    }

}
