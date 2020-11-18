# Multiple Select

This component is an extended version of Vaadin Select supporting multiple-items selection. It is the Vaadin 14 Java integration of @vaadin-component-factory/vcf-multi-select.

## Install

To use the component in an application using maven, add the following dependency to your pom.xml:

```
<dependency>
    <groupId>com.vaadin.componentfactory</groupId>
    <artifactId>multiple-select</artifactId>
    <version>${component.version}</version>
</dependency>
```

## Usage

The component is intended to be used in the same way as Vaadin Select. For example,

```
MultipleSelect<String> labelSelect = new MultipleSelect<>();
labelSelect.setItems("Option one", "Option two");
labelSelect.setLabel("Label");

MultipleSelect<String> placeholderSelect = new MultipleSelect<>();
placeholderSelect.setItems("Option one", "Option two");
placeholderSelect.setPlaceholder("Placeholder");

MultipleSelect<String> valueSelect = new MultipleSelect<>();
valueSelect.setItems("Value", "Option one", "Option two");
valueSelect.setValue("Value");

add(labelSelect, placeholderSelect, valueSelect);
```



## Licnese

Apache License 2
