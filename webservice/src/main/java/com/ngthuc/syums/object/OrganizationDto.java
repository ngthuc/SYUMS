package com.ngthuc.syums.object;

public class OrganizationDto {
    private String name;
    private String nickname;
    private Long parent_id;

    public OrganizationDto(String name, String nickname, Long parent_id) {
        this.name = name;
        this.nickname = nickname;
        this.parent_id = parent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }
}
