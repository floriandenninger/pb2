package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aumf extends aonm implements aooz {
    public static final aumf a;
    private static volatile aopf k;
    public int b;
    public aqyg c;
    public aqyg d;
    public aulq e;
    public aulq f;
    public aulq g;
    public boolean h;
    public aulq i;
    public aulq j;
    private aulq l;
    private byte m = 2;

    static {
        aumf aumfVar = new aumf();
        a = aumfVar;
        aonm.registerDefaultInstance(aumf.class, aumfVar);
    }

    private aumf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဇ\u0007\tᐉ\b\nᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "l", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aumf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (aumf.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
