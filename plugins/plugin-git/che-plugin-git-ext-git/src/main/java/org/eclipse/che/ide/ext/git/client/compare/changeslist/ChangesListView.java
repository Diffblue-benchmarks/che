/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.ext.git.client.compare.changeslist;

import org.eclipse.che.ide.api.mvp.View;
import org.eclipse.che.ide.ext.git.client.compare.changespanel.ChangesPanelView;

/**
 * The view of {@link ChangesListPresenter}.
 *
 * @author Igor Vinokur
 */
public interface ChangesListView extends View<ChangesListView.ActionDelegate> {
  /** Needs for delegate some function into Changed list view. */
  interface ActionDelegate {
    /**
     * Performs any actions appropriate in response to the user having pressed the 'Close' button.
     */
    void onCloseClicked();

    /**
     * Performs any actions appropriate in response to the user having pressed the 'Compare' button.
     */
    void onCompareClicked();
  }

  /** Close dialog. */
  void close();

  /** Show dialog. */
  void showDialog();

  /**
   * Change the enable state of the compare button.
   *
   * @param enabled <code>true</code> to enable the button, <code>false</code> to disable it
   */
  void setEnableCompareButton(boolean enabled);

  /** Initialize changes panel. */
  void setChangesPanelView(ChangesPanelView changesPanelView);
}
