package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqzf extends aonm implements aooz {
    public static final aqzf a;
    private static volatile aopf l;
    public int b;
    public int c;
    public aqyg d;
    public aqyg f;
    public aqyg g;
    public apxf h;
    public avvd i;
    private aota m;
    private byte n = 2;
    public String e = "";
    public String j = "";
    public aomf k = aomf.b;

    static {
        aqzf aqzfVar = new aqzf();
        a = aqzfVar;
        aonm.registerDefaultInstance(aqzf.class, aqzfVar);
    }

    private aqzf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0006\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဈ\u0007\tᐉ\b\nည\t", new Object[]{"b", "c", aqze.c, "d", "e", "f", "g", "h", "i", "j", "m", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aqzf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (aqzf.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
