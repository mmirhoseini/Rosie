/*
 * Copyright (C) 2015 Karumi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.karumi.rosie.sample.comics.view.renderer;

import com.karumi.rosie.sample.comics.view.viewmodel.ComicSeriesViewModel;
import com.pedrogomez.renderers.ListAdapteeCollection;

public class ComicsSeriesAdapteeCollection extends ListAdapteeCollection<ComicSeriesViewModel> {

  private boolean showLoadMore = true;

  public void setShowLoadMore(boolean showLoadMore) {
    this.showLoadMore = showLoadMore;
  }

  @Override public int size() {
    int size = super.size();
    return showLoadMore ? size + 1 : size;
  }

  @Override public ComicSeriesViewModel get(int i) {
    ComicSeriesViewModel item = null;
    if (i < super.size()) {
      item = super.get(i);
    }
    return item;
  }
}
