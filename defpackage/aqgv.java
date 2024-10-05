package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqgv extends aonm implements aooz {
    public static final aqgv a;
    private static volatile aopf h;
    public aqyg b;
    public aulq d;
    public int e;
    public aulq f;
    public aulq g;
    private int i;
    private byte j = 2;
    public String c = "";

    static {
        aqgv aqgvVar = new aqgv();
        a = aqgvVar;
        aonm.registerDefaultInstance(aqgv.class, aqgvVar);
    }

    private aqgv() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ဌ\u0003", new Object[]{"i", "b", "c", "d", "f", "g", "e", aufb.d});
            case NEW_MUTABLE_INSTANCE:
                return new aqgv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqgv.class) {
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
