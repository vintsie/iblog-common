package org.vint.iblog.common.bean.nor;

/**
 *
 * Created by Vin on 14-5-17.
 */
public class GitHubObject {


    private String markdownContent;
    private String sha;
    private String repoInfo;

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }



    public String getMarkdownContent() {
        return markdownContent;
    }

    public void setMarkdownContent(String markdownContent) {
        this.markdownContent = markdownContent;
    }

    public String getRepoInfo() {
        return repoInfo;
    }

    public void setRepoInfo(String repoInfo) {
        this.repoInfo = repoInfo;
    }
}
