package de.wicketpraxis.web.blog.pages.questions.ajax.overview;

import org.apache.wicket.PageParameters;
import org.apache.wicket.RequestCycle;
import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.markup.html.panel.Panel;

public class MousePosPanel extends Panel {

	public MousePosPanel(String id) {
		super(id);

		final FeedbackPanel feedbackPanel = new FeedbackPanel("feedback");
		feedbackPanel.setOutputMarkupId(true);
		add(feedbackPanel);

		WebMarkupContainer box = new WebMarkupContainer("box");
		box.add(new AjaxEventBehavior("onclick") {

			@Override
			protected void onEvent(AjaxRequestTarget target) {
				PageParameters pageParameters = RequestCycle.get().getPageParameters();
				info("geklickt: " + pageParameters);
				target.addComponent(feedbackPanel);
			}
		});
		add(box);
	}

}
