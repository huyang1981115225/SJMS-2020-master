package jiegouxing.day04composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HuYang
 * @date 2019-11-01 14:41
 */
public interface AbstractFile {

    /**
     * 杀毒
     */
    void killVirus();
}

/**
 * 定义叶子 图片文件
 */
class ImageFileLeaf implements AbstractFile {

    private String name;

    public ImageFileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("--图片文件 " + name + ",进行查杀！");
    }
}

/**
 * 定义叶子 文本文件
 */
class TextFileLeaf implements AbstractFile {

    private String name;

    public TextFileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("--文本文件 " + name + ",进行查杀！");
    }
}

class VideoFileLeaf implements AbstractFile {

    private String name;

    public VideoFileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("--视频文件 " + name + ",进行查杀！");
    }
}

/**
 * 定义容器：文件夹
 */
class FolderComposite implements AbstractFile {

    private String name;

    public FolderComposite(String name) {
        this.name = name;
    }

    private List<AbstractFile> list = new ArrayList<>();

    public void add(AbstractFile abstractFile) {
        list.add(abstractFile);
    }

    public void remove(AbstractFile abstractFile) {
        list.remove(abstractFile);
    }

    public AbstractFile getChild(int index) {
        return list.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("--文件夹 " + this.name);
        for (AbstractFile abstractFile : list) {
            abstractFile.killVirus();
        }
    }
}