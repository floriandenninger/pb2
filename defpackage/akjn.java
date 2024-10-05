package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.protos.youtube.api.innertube.StoriesShareCommandOuterClass$StoriesShareCommand;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akjn implements aaha {
    private static final String a = zga.a("ShareStoriesCommand");
    private final akhi b;

    public akjn(akhi akhiVar) {
        this.b = akhiVar;
    }

    private static final Bitmap b(aomf aomfVar) {
        return BitmapFactory.decodeByteArray(aomfVar.I(), 0, aomfVar.d());
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aomf aomfVar;
        StoriesShareCommandOuterClass$StoriesShareCommand storiesShareCommandOuterClass$StoriesShareCommand = (StoriesShareCommandOuterClass$StoriesShareCommand) apxfVar.pX(StoriesShareCommandOuterClass$StoriesShareCommand.storiesShareCommand);
        Bitmap b = b(storiesShareCommandOuterClass$StoriesShareCommand.d);
        try {
            int bd = aobq.bd(storiesShareCommandOuterClass$StoriesShareCommand.e);
            if (bd == 0) {
                bd = 1;
            }
            int i = bd - 1;
            if (i == 1) {
                akhi akhiVar = this.b;
                Intent e = akhi.e(storiesShareCommandOuterClass$StoriesShareCommand.g, "snapchat://creativekit/camera/1", storiesShareCommandOuterClass$StoriesShareCommand.f);
                akhiVar.c(e, b);
                akhiVar.d(e);
                return;
            }
            if (i == 2) {
                if (storiesShareCommandOuterClass$StoriesShareCommand.b == 2) {
                    aomfVar = (aomf) storiesShareCommandOuterClass$StoriesShareCommand.c;
                } else {
                    aomfVar = aomf.b;
                }
                Bitmap b2 = b(aomfVar);
                akhi akhiVar2 = this.b;
                Intent e2 = akhi.e(storiesShareCommandOuterClass$StoriesShareCommand.g, "snapchat://creativekit/preview/1", storiesShareCommandOuterClass$StoriesShareCommand.f);
                akhiVar2.c(e2, b);
                try {
                    e2.putExtra("android.intent.extra.STREAM", ev.a(akhiVar2.a, akhiVar2.b(), akhiVar2.a(b2, "background")));
                    akhiVar2.d(e2);
                    return;
                } catch (IOException e3) {
                    throw new Exception("Failed to create story background asset.", e3);
                }
            }
            zga.c(a, "Unknown story share target.");
        } catch (Exception e4) {
            zga.f(a, "Unable to create share intent.", e4);
        }
    }
}
