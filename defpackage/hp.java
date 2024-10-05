package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.view.WindowInsets;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hp {
    public static Bundle a(PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static int c(int i) {
        int statusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 256; i3 += i3) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                }
                i2 |= statusBars;
            }
        }
        return i2;
    }

    public static int d(bjc bjcVar, atc atcVar, int i, boolean z) {
        return bjcVar.B(atcVar, i, z);
    }

    public static void e(bjc bjcVar, pth pthVar, int i) {
        bjcVar.u(pthVar, i, 0);
    }

    public static int f(byte[] bArr) {
        return bArr[9] & 255;
    }

    public static int g(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static long h(long j) {
        return (j * 48000) / 1000000000;
    }

    public static List i(byte[] bArr) {
        int g = g(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(k(j(g)));
        arrayList.add(k(j(3840L)));
        return arrayList;
    }

    private static long j(long j) {
        return (j * 1000000000) / 48000;
    }

    private static byte[] k(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
