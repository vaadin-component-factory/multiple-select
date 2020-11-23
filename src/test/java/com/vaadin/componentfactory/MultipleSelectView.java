package com.vaadin.componentfactory;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class MultipleSelectView extends Div {

    public MultipleSelectView() {
        MultipleSelect<String> multipleSelect = new MultipleSelect<>();
        multipleSelect.setItems("Jose", "Manolo", "Pedro");

        multipleSelect.setLabel("MultipleSelect");
        multipleSelect.setPlaceholder("Select multiple items");
        multipleSelect.setWidth("25%");

        add(multipleSelect);
    }
}
