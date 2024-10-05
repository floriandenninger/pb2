package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DeleteReelItem$DeleteReelItemEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iep implements aaha {
    public final Context a;
    public final abbm b;
    public final afsy c;
    public final ili d;
    public int e = 0;
    public final abig f;
    private AlertDialog g;

    public iep(Context context, abbm abbmVar, afsy afsyVar, abig abigVar, ili iliVar, byte[] bArr) {
        this.a = context;
        abbmVar.getClass();
        this.b = abbmVar;
        afsyVar.getClass();
        this.c = afsyVar;
        abigVar.getClass();
        this.f = abigVar;
        iliVar.getClass();
        this.d = iliVar;
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, Map map) {
        this.e = this.d.a();
        if (this.g == null) {
            AlertDialog create = new AlertDialog.Builder(this.a).setMessage(R.string.delete_reel_item_confirmation).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
            this.g = create;
            create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ien
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    iep iepVar = iep.this;
                    iepVar.d.c(iepVar.e);
                    iepVar.e = 0;
                }
            });
        }
        this.g.setButton(-1, this.a.getString(android.R.string.ok), new DialogInterface.OnClickListener() { // from class: iem
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                iep iepVar = iep.this;
                apxf apxfVar2 = apxfVar;
                aone createBuilder = aros.a.createBuilder();
                DeleteReelItem$DeleteReelItemEndpoint deleteReelItem$DeleteReelItemEndpoint = (DeleteReelItem$DeleteReelItemEndpoint) apxfVar2.pX(DeleteReelItem$DeleteReelItemEndpoint.deleteReelItemEndpoint);
                String str = deleteReelItem$DeleteReelItemEndpoint.c;
                createBuilder.copyOnWrite();
                aros arosVar = (aros) createBuilder.instance;
                str.getClass();
                arosVar.b |= 4;
                arosVar.e = str;
                String str2 = deleteReelItem$DeleteReelItemEndpoint.b;
                createBuilder.copyOnWrite();
                aros arosVar2 = (aros) createBuilder.instance;
                str2.getClass();
                arosVar2.b |= 2;
                arosVar2.d = str2;
                try {
                    abbm abbmVar = iepVar.b;
                    abbk abbkVar = new abbk(abbmVar.f, iepVar.c.c(), createBuilder, null, null, null);
                    abbkVar.i = aaec.b(abbmVar.g);
                    abbkVar.k();
                    iepVar.b.b.e(abbkVar, new ieo(iepVar, (aros) createBuilder.build()));
                } catch (aasx unused) {
                }
            }
        });
        this.g.show();
    }
}
