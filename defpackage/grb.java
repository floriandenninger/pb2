package defpackage;

import com.google.protos.youtube.api.innertube.FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand;
import com.google.protos.youtube.api.innertube.FilterChipTransformCommandOuterClass$FilterChipTransformCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class grb implements aaha {
    private final /* synthetic */ int a;
    private final aoae b;

    public grb(aoae aoaeVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = i;
        this.b = aoaeVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        int i = this.a;
        if (i == 0) {
            if (apxfVar.pY(FilterChipTransformCommandOuterClass$FilterChipTransformCommand.filterChipTransformCommand)) {
                aoae aoaeVar = this.b;
                FilterChipTransformCommandOuterClass$FilterChipTransformCommand filterChipTransformCommandOuterClass$FilterChipTransformCommand = (FilterChipTransformCommandOuterClass$FilterChipTransformCommand) apxfVar.pX(FilterChipTransformCommandOuterClass$FilterChipTransformCommand.filterChipTransformCommand);
                if (aoaeVar.I().h()) {
                    ((mbn) aoaeVar.I().c()).f(filterChipTransformCommandOuterClass$FilterChipTransformCommand);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 1) {
            if (apxfVar.pY(asmo.b)) {
                aoae aoaeVar2 = this.b;
                asmo asmoVar = (asmo) apxfVar.pX(asmo.b);
                if (aoaeVar2.I().h()) {
                    ((mbn) aoaeVar2.I().c()).g(asmoVar);
                    return;
                }
                return;
            }
            return;
        }
        if (apxfVar.pY(FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.filterBarContentInsertionCommand)) {
            aoae aoaeVar3 = this.b;
            FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand = (FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand) apxfVar.pX(FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.filterBarContentInsertionCommand);
            if (aoaeVar3.I().h()) {
                ((mbn) aoaeVar3.I().c()).e(filterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand);
            }
        }
    }
}
