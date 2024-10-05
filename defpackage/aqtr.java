package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqtr extends aonm implements aooz {
    public static final aqtr a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aqtr aqtrVar = new aqtr();
        a = aqtrVar;
        aonm.registerDefaultInstance(aqtr.class, aqtrVar);
    }

    private aqtr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0000\uf158ᠤ\uf0a1遆\u0006\u0000\u0000\u0006\uf158ᠤᐼ\u0000ﳌ䈠ᐼ\u0000\ueb1b堗ᐼ\u0000\uf346峋ᐼ\u0000\ue9af峽ᐼ\u0000\uf0a1遆ᐼ\u0000", new Object[]{"c", "b", aubs.class, aqtu.class, apbr.class, apbq.class, apbo.class, avhr.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqtr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqtr.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
