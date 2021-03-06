package cc.mallet.examples;

import java.util.Vector;

public class ClassTestResultTopicModel {
    ClassTestResultTopicModel(String name, String packageName) {
        System.out.println("class:" + name + " package:" + packageName);
        className = name;
        this.packageName = packageName;
        findClass = new Vector<>();
        findPackage = new Vector<>();
    }
    String className, packageName;
    Vector<String> findClass, findPackage;
}
