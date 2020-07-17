package jiegouxing.day04composite;

/**
 * @author HuYang
 * @date 2019-11-01 14:51
 */
public class Test {

    /**
     * 我的收藏
     *        --林允儿.jpg
     *        --log.txt
     *        --电影
     *             --战狼1.avi
     *             --战狼2.avi
     */
    public static void main(String[] args) {

        FolderComposite folder = new FolderComposite("我的收藏");
        AbstractFile image = new ImageFileLeaf("林允儿.jpg");
        AbstractFile text = new TextFileLeaf("log.txt");

        folder.add(image);
        folder.add(text);

        FolderComposite folder2 = new FolderComposite("电影");
        AbstractFile video1 = new VideoFileLeaf("战狼1.avi");
        AbstractFile video2 = new VideoFileLeaf("战狼2.avi");

        folder2.add(video1);
        folder2.add(video2);

        folder.add(folder2);
        folder.killVirus();
    }
}
