package jpabook.jpashop.domain;


import javax.persistence.*;

@Entity
public class Category_Item {


    @Id
    @GeneratedValue
    @Column(name = "CATEGORY_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="CATEGORY_ID")
    private Category category;

    @ManyToOne
    @JoinColumn(name="ITEM_ID")
    private Item item;

}
