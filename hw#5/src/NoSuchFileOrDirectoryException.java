/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radra_000
 */
public class NoSuchFileOrDirectoryException extends Exception{

    static String message = "This is directory is full, the node contains 3 "
            + "childrens already";

    public NoSuchFileOrDirectoryException() {
        super(message);
    }

    public NoSuchFileOrDirectoryException(String message) {
        super(message);
    }
}
