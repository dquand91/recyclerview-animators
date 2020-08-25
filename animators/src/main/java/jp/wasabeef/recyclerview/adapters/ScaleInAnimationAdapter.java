package jp.wasabeef.recyclerview.adapters;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Copyright (C) 2020 Wasabeef
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

public class ScaleInAnimationAdapter extends AnimationAdapter {

  private static final float DEFAULT_SCALE_FROM = .5f;
  private final float mFrom;

  public ScaleInAnimationAdapter(RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter) {
    this(adapter, DEFAULT_SCALE_FROM);
  }

  public ScaleInAnimationAdapter(RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter,
    float from) {
    super(adapter);
    mFrom = from;
  }

  @Override protected Animator[] getAnimators(@NonNull View view) {
    ObjectAnimator scaleX = ObjectAnimator.ofFloat(view, "scaleX", mFrom, 1f);
    ObjectAnimator scaleY = ObjectAnimator.ofFloat(view, "scaleY", mFrom, 1f);
    return new ObjectAnimator[] { scaleX, scaleY };
  }
}
