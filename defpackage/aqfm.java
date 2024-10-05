package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqfm extends aonm implements aooz {
    public static final aqfm a;
    private static volatile aopf b;
    private int c;
    private aqfw d;
    private aqfo e;
    private aqfx f;
    private aqfq g;
    private aqff h;
    private aqfp i;
    private aqfu j;
    private byte k = 2;

    static {
        aqfm aqfmVar = new aqfm();
        a = aqfmVar;
        aonm.registerDefaultInstance(aqfm.class, aqfmVar);
    }

    private aqfm() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\ufbd0⏝\uf6dd搜\u0007\u0000\u0000\u0007\ufbd0⏝ᐉ\u0005\uf354␆ᐉ\u0000\uf379␆ᐉ\u0002\uf2ec⻊ᐉ\u0006\ued84䃲ᐉ\u0001\ue1ea拿ᐉ\u0003\uf6dd搜ᐉ\u0004", new Object[]{"c", "i", "d", "f", "j", "e", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqfm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqfm.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
