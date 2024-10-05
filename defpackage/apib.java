package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apib extends aonm implements aooz {
    public static final apib a;
    private static volatile aopf l;
    public int b;
    public Object d;
    public aqyg e;
    public aqyg f;
    public int g;
    public apia h;
    public apia i;
    public apic j;
    private aota m;
    public int c = 0;
    private byte n = 2;
    public aomf k = aomf.b;

    static {
        apib apibVar = new apib();
        a = apibVar;
        aonm.registerDefaultInstance(apib.class, apibVar);
    }

    private apib() {
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
                return newMessageInfo(a, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ြ\u0000\u0004ဋ\u0005\u0005ᐉ\t\u0006ည\n\u0007ᐼ\u0000\bᐉ\u0006\tဉ\b\nᐉ\u0007\u000bᐼ\u0000", new Object[]{"d", "c", "b", "e", "f", apid.class, "g", "m", "k", avgg.class, "h", "j", "i", apif.class});
            case NEW_MUTABLE_INSTANCE:
                return new apib();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (apib.class) {
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
