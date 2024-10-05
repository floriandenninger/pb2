package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqrr extends aonm implements aooz {
    public static final aqrr a;
    private static volatile aopf k;
    public int b;
    public Object d;
    public aqyg e;
    public aqyg f;
    public avgg g;
    public aulq h;
    public aulq i;
    public aulq j;
    private apmh l;
    private aulq m;
    private awfb n;
    public int c = 0;
    private byte o = 2;

    static {
        aqrr aqrrVar = new aqrr();
        a = aqrrVar;
        aonm.registerDefaultInstance(aqrr.class, aqrrVar);
    }

    private aqrr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0001\u0001\u0001\u0013\u000b\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0003\u0006ှ\u0000\u0007ᐉ\u0006\bᐉ\u0007\nျ\u0000\u000bᐉ\b\u0012ᐉ\u000b\u0013ᐉ\t", new Object[]{"d", "c", "b", "e", "f", "g", "l", "h", "i", "j", "n", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aqrr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (aqrr.class) {
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
