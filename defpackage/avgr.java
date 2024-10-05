package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avgr extends aonm implements aooz {
    public static final avgr a;
    private static volatile aopf b;
    private int c;
    private aulq d;
    private aulq e;
    private apxf f;
    private apxf g;
    private apxf h;
    private apxf i;
    private aota j;
    private aulq k;
    private byte l = 2;

    static {
        avgr avgrVar = new avgr();
        a = avgrVar;
        aonm.registerDefaultInstance(avgr.class, avgrVar);
    }

    private avgr() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000e\b\u0000\u0000\b\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0007\nᐉ\f\rᐉ\u0004\u000eᐉ\u0006", new Object[]{"c", "d", "e", "f", "h", "j", "k", "g", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new avgr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avgr.class) {
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
