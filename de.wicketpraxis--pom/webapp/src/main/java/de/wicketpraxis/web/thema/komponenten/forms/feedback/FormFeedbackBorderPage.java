/*****************************************
 * Quelltexte zum Buch: Praxisbuch Wicket
 * (http://www.hanser.de/978-3-446-41909-4)
 * 
 * Autor: Michael Mosmann
 * (michael@mosmann.de)
 *****************************************/
package de.wicketpraxis.web.thema.komponenten.forms.feedback;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.form.validation.FormComponentFeedbackBorder;
import org.apache.wicket.model.Model;

import de.wicketpraxis.web.thema.komponenten.forms.AbstractFormPage;

public class FormFeedbackBorderPage extends AbstractFormPage {

	public FormFeedbackBorderPage() {
		Form<?> f1 = new Form<Void>("form");

		TextField<String> textField = new TextField<String>("Text", new Model());
		textField.setRequired(true);

		TextField<String> textField2 = new TextField<String>("Text2", new Model());
		textField2.setRequired(true);

		f1.add(new FormComponentFeedbackBorder("feedback").add(textField));
		f1.add(textField2);

		add(f1);
	}
}
