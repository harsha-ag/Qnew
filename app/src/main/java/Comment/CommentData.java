package Comment;

public class CommentData {
    private String comment;
    private String imageid;
    private String name;
    private int likecount;
    private int dislikecount;

    public CommentData(String comment, String imageid, String name,int likecount,int dislikecount) {
        this.comment = comment;
        this.imageid = imageid;
        this.name = name;
        this.likecount=likecount;
        this.dislikecount=dislikecount;
    }

    public String getComment() {
        return comment;
    }

    public String getImageid() {
        return imageid;
    }

    public String getName() {
        return name;
    }

    public int getLikecount() {
        return likecount;
    }

    public int getDislikecount() {
        return dislikecount;
    }
}
