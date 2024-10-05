package defpackage;

import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azzg extends azum implements azty {
    final /* synthetic */ azzf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azzg(azzf azzfVar) {
        super(2);
        this.a = azzfVar;
    }

    @Override // defpackage.azty
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        azss azssVar = (azss) obj2;
        azst key = azssVar.getKey();
        azss azssVar2 = this.a.b.get(key);
        if (key != azxg.b) {
            return Integer.valueOf(azssVar != azssVar2 ? CellularSignalStrengthError.ERROR_NOT_SUPPORTED : intValue + 1);
        }
        azxg azxgVar = (azxg) azssVar2;
        azxg azxgVar2 = (azxg) azssVar;
        if (azxgVar2 != azxgVar && (azxgVar2 instanceof baaa)) {
            throw null;
        }
        if (azxgVar2 != azxgVar) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + azxgVar2 + ", expected child of " + azxgVar + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
        if (azxgVar != null) {
            intValue++;
        }
        return Integer.valueOf(intValue);
    }
}
