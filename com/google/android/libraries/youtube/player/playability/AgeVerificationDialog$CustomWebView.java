package com.google.android.libraries.youtube.player.playability;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AgeVerificationDialog$CustomWebView extends WebView {
    public AgeVerificationDialog$CustomWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.webkit.WebView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (editorInfo != null) {
            editorInfo.imeOptions &= -3;
            editorInfo.imeOptions |= 5;
        }
        return onCreateInputConnection;
    }
}
