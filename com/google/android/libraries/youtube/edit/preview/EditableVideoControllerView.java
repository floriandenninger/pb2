package com.google.android.libraries.youtube.edit.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.vsy;
import defpackage.vwk;
import defpackage.vwl;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class EditableVideoControllerView extends vwl {
    private final ImageView f;

    public EditableVideoControllerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.editable_video_controller_view, (ViewGroup) this, true);
        h((TextView) findViewById(R.id.play_position_text), (TextView) findViewById(R.id.video_duration_text), (SeekBar) findViewById(R.id.play_progress_bar));
        ImageView imageView = (ImageView) findViewById(R.id.play_button);
        this.f = imageView;
        imageView.setOnClickListener(new vwk(this));
    }

    @Override // defpackage.vwl, defpackage.vsz
    public final void a(vsy vsyVar, Set set) {
        super.a(vsyVar, set);
        setVisibility(4);
    }

    @Override // defpackage.vwl, defpackage.vsz
    public final void c(vsy vsyVar, Set set) {
        super.c(vsyVar, set);
        setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vwl
    public final void q() {
        if (u()) {
            this.f.setImageResource(R.drawable.ic_preview_pause_btn);
            this.f.setContentDescription(getContext().getString(R.string.edit_pause_button_content_description));
        } else {
            this.f.setImageResource(R.drawable.ic_preview_play_btn);
            this.f.setContentDescription(getContext().getString(R.string.edit_play_button_content_description));
        }
    }
}
