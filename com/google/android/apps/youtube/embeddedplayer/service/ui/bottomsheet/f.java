package com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.youtube.R;
import defpackage.alta;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f extends ArrayAdapter {
    public f(Context context) {
        super(context, R.layout.embed_bottom_sheet_list_item);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a aVar = (com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a) getItem(i);
        if (view == null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            if (aVar != null) {
                view = from.inflate(R.layout.embed_bottom_sheet_list_item, viewGroup, false);
            } else {
                view = from.inflate(R.layout.embed_bottom_sheet_list_item, viewGroup, false);
            }
        }
        if (aVar != null) {
            aVar.a(view, getContext());
        } else {
            StringBuilder sb = new StringBuilder(71);
            sb.append("Cannot build view; empty bottom sheet list item at position ");
            sb.append(i);
            alta.B(sb.toString(), new Object[0]);
        }
        return view;
    }
}
