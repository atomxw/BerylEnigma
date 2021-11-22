package ffffffff0x.beryenigma.App.View.Modules.Encryption.Coding.BaseEncoding.Base32;

import ffffffff0x.beryenigma.App.Controller.Encryption.Coding.BaseEncoding.Coding_Base16;
import ffffffff0x.beryenigma.App.Controller.Encryption.Coding.BaseEncoding.Coding_Base32;
import ffffffff0x.beryenigma.App.View.Modules.Encryption.Coding.BaseEncoding.BaseEncodingViewController;
import ffffffff0x.beryenigma.Kit.Utils.FileUtils;

import java.io.UnsupportedEncodingException;

/**
 * @author: RyuZUSUNC
 * @create: 2021/11/22 21:38
 **/
public class Base32ViewController extends BaseEncodingViewController {
    @Override
    protected String encodeSplitToString() {
        try {
            return Coding_Base32.encodeSplitToString(JTA_src.getText(),JCB_charset.getValue().toString(),JTF_split.getText());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            JTA_dst.validate();
        }
        return "";
    }

    @Override
    protected String decodeSplitToString() {
        try {
            return Coding_Base32.decodeSplitToString(JTA_src.getText(),JCB_charset.getValue().toString(),JTF_split.getText());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            JTA_dst.validate();
        }
        return "";
    }

    @Override
    protected String encodeToString() {
        try {
            return Coding_Base32.encodeToString(JTA_src.getText(),JCB_charset.getValue().toString());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            JTA_dst.validate();
        }
        return "";
    }

    @Override
    protected String decodeToString() {
        try {
            return Coding_Base32.decodeToString(JTA_src.getText(),JCB_charset.getValue().toString());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            JTA_dst.validate();
        }
        return "";
    }

    @Override
    protected void encodeToFile() {
        try {
            FileUtils.outPutFile(Coding_Base32.encodeToString(file).getBytes(JCB_charset.getValue().toString()));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            JTA_dst.validate();
        }
    }

    @Override
    protected void decodeToFile() {
        try {
            FileUtils.outPutFile((Coding_Base32.decodeToString(file,JCB_charset.getValue().toString())).getBytes(JCB_charset.getValue().toString()));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            JTA_dst.validate();
        }
    }
}
