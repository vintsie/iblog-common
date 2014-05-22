package org.vint.iblog.common.bean.nor;

import java.io.Serializable;

/**
 *
 * Created by Vin on 14-5-17.
 */
public class CBNGitHubCatalog implements Serializable{

    private String owner;
    private String repo;
    private String path;
    private String type;

    public String getRepoInfo(){
        return owner + "^" + repo + "^" + path;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
