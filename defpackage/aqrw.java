package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqrw extends aonm implements aooz {
    public static final aqrw a;
    private static volatile aopf f;
    public int b;
    public avgg c;
    public aulq d;
    public aulq e;
    private apxf g;
    private byte h = 2;

    static {
        aqrw aqrwVar = new aqrw();
        a = aqrwVar;
        aonm.registerDefaultInstance(aqrw.class, aqrwVar);
    }

    private aqrw() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0004\u0007\u0004\u0000\u0000\u0004\u0004ᐉ\u0000\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0001", new Object[]{"b", "c", "d", "e", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqrw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqrw.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
