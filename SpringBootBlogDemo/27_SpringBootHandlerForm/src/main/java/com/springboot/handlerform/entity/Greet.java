package com.springboot.handlerform.entity;

/**
 * @Description:
 * @Auther: zrblog
 * @CreateTime: 2018-10-21 22:48
 * @Version:v1.0
 */
public class Greet {

    private long id;

    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Greet{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
