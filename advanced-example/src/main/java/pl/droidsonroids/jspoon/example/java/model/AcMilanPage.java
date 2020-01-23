package pl.droidsonroids.jspoon.example.java.model;

import java.util.List;

import pl.droidsonroids.jspoon.annotation.Selector;

public class AcMilanPage {
    @Selector(".posts__item--card") public List<AcMilanPost> posts;
}
