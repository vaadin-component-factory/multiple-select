package com.vaadin.componentfactory;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;

@Route("")
public class MultipleSelectView extends VerticalLayout {

    public MultipleSelectView() {
        MultipleSelect<String> multipleSelect = new MultipleSelect<>();
        multipleSelect.setItems("Jose", "Manolo", "Pedro", "Luis");

        multipleSelect.setLabel("MultipleSelect");
        multipleSelect.setPlaceholder("Select multiple items");
        multipleSelect.setWidth("200px");

        add(multipleSelect);

        add(new Span("Toggle DisplayAllSelected:"), new Button(
                "Toggle DisplayAllSelected",
                e -> multipleSelect.setDisplayAllSelected(
                !multipleSelect.isDisplayAllSelected())));

        HorizontalLayout extraItemsAdjustLayout = getExtraItemsAdjustLayout(
                multipleSelect);
        add(extraItemsAdjustLayout);

        HorizontalLayout widthAdjustLayout = getWidthAdjustLayout(
                multipleSelect);
        add(widthAdjustLayout);
    }

    private HorizontalLayout getExtraItemsAdjustLayout(
            MultipleSelect<String> multipleSelect) {
        TextField singularString = new TextField("Singular String");
        singularString.setValue("other");
        TextField pluralString = new TextField("Plural String");
        pluralString.setValue("others");
        Button setExtraItemsCountText = new Button("Set ExtraItemsCountText",
                e -> multipleSelect.setExtraItemsCountText(
                        singularString.getValue(), pluralString.getValue()));

        HorizontalLayout extraItemsAdjustLayout = new HorizontalLayout(
                singularString, pluralString, setExtraItemsCountText);
        extraItemsAdjustLayout
                .setDefaultVerticalComponentAlignment(Alignment.END);
        return extraItemsAdjustLayout;
    }

    private HorizontalLayout getWidthAdjustLayout(
            MultipleSelect<String> multipleSelect) {
        IntegerField width = new IntegerField("Width (in pixels)");
        width.setValueChangeMode(ValueChangeMode.ON_CHANGE);
        width.setValue(200);
        width.setMin(0);
        Button setWidth = new Button("Set width",
                e -> multipleSelect.setWidth(width.getValue() + "px"));

        HorizontalLayout widthAdjustLayout = new HorizontalLayout(width,
                setWidth);
        widthAdjustLayout.setDefaultVerticalComponentAlignment(Alignment.END);
        return widthAdjustLayout;
    }
}
