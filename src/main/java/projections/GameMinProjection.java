package projections;

public interface GameMinProjection {

    /* consulta SQL no Spring data JPA */
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
