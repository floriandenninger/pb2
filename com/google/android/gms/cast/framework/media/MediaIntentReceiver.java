package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import defpackage.qft;
import defpackage.qfy;
import defpackage.qgv;
import defpackage.qgw;
import defpackage.qip;
import defpackage.qis;
import defpackage.qit;
import defpackage.qjk;
import defpackage.tfq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";

    private static qjk getRemoteMediaClient(qfy qfyVar) {
        if (qfyVar == null || !qfyVar.o()) {
            return null;
        }
        return qfyVar.c();
    }

    private void seek(qfy qfyVar, long j) {
        qjk remoteMediaClient;
        if (j == 0 || (remoteMediaClient = getRemoteMediaClient(qfyVar)) == null || remoteMediaClient.o() || remoteMediaClient.s()) {
            return;
        }
        long c = remoteMediaClient.c();
        tfq tfqVar = new tfq(null);
        tfqVar.a = c + j;
        remoteMediaClient.t(tfqVar.b());
    }

    private void togglePlayback(qfy qfyVar) {
        qjk remoteMediaClient = getRemoteMediaClient(qfyVar);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.k();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        qgw d;
        qgv b;
        char c;
        String action = intent.getAction();
        if (action == null || (b = (d = qft.b(context).d()).b()) == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1699820260:
                if (action.equals(ACTION_REWIND)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -945151566:
                if (action.equals(ACTION_SKIP_NEXT)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -945080078:
                if (action.equals(ACTION_SKIP_PREV)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -668151673:
                if (action.equals(ACTION_STOP_CASTING)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -124479363:
                if (action.equals(ACTION_DISCONNECT)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 235550565:
                if (action.equals(ACTION_TOGGLE_PLAYBACK)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1362116196:
                if (action.equals(ACTION_FORWARD)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1997055314:
                if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                onReceiveActionTogglePlayback(b);
                return;
            case 1:
                onReceiveActionSkipNext(b);
                return;
            case 2:
                onReceiveActionSkipPrev(b);
                return;
            case 3:
                onReceiveActionForward(b, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                return;
            case 4:
                onReceiveActionRewind(b, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                return;
            case 5:
                d.d(true);
                return;
            case 6:
                d.d(false);
                return;
            case 7:
                onReceiveActionMediaButton(b, intent);
                return;
            default:
                onReceiveOtherAction(context, action, intent);
                return;
        }
    }

    protected void onReceiveActionForward(qgv qgvVar, long j) {
        if (qgvVar instanceof qfy) {
            seek((qfy) qgvVar, j);
        }
    }

    protected void onReceiveActionMediaButton(qgv qgvVar, Intent intent) {
        if ((qgvVar instanceof qfy) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            qip.an(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((qfy) qgvVar);
            }
        }
    }

    protected void onReceiveActionRewind(qgv qgvVar, long j) {
        if (qgvVar instanceof qfy) {
            seek((qfy) qgvVar, -j);
        }
    }

    protected void onReceiveActionSkipNext(qgv qgvVar) {
        qjk remoteMediaClient;
        if (!(qgvVar instanceof qfy) || (remoteMediaClient = getRemoteMediaClient((qfy) qgvVar)) == null || remoteMediaClient.s()) {
            return;
        }
        qip.as("Must be called from the main thread.");
        if (!remoteMediaClient.l()) {
            qjk.v();
        } else {
            qjk.u(new qit(remoteMediaClient));
        }
    }

    protected void onReceiveActionSkipPrev(qgv qgvVar) {
        qjk remoteMediaClient;
        if (!(qgvVar instanceof qfy) || (remoteMediaClient = getRemoteMediaClient((qfy) qgvVar)) == null || remoteMediaClient.s()) {
            return;
        }
        qip.as("Must be called from the main thread.");
        if (!remoteMediaClient.l()) {
            qjk.v();
        } else {
            qjk.u(new qis(remoteMediaClient));
        }
    }

    protected void onReceiveActionTogglePlayback(qgv qgvVar) {
        if (qgvVar instanceof qfy) {
            togglePlayback((qfy) qgvVar);
        }
    }

    protected void onReceiveOtherAction(Context context, String str, Intent intent) {
    }

    @Deprecated
    protected void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }
}
