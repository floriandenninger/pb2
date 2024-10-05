package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqeq extends aonm implements aooz {
    public static final aqeq a;
    private static volatile aopf h;
    public int b;
    public Object d;
    public arfs e;
    public aots f;
    public aqep g;
    private aota i;
    public int c = 0;
    private byte j = 2;

    static {
        aqeq aqeqVar = new aqeq();
        a = aqeqVar;
        aonm.registerDefaultInstance(aqeq.class, aqeqVar);
    }

    private aqeq() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ဉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006", new Object[]{"d", "c", "b", "e", apxf.class, apxf.class, "f", "i", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqeq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqeq.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
