package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auhr extends aonm implements aooz {
    public static final auhr a;
    private static volatile aopf j;
    public int b;
    public augy c;
    public augm d;
    public aulq f;
    public aoxy g;
    private aota k;
    private aulq l;
    private byte m = 2;
    public aony e = emptyProtobufList();
    public aomf h = aomf.b;
    public String i = "";

    static {
        auhr auhrVar = new auhr();
        a = auhrVar;
        aonm.registerDefaultInstance(auhr.class, auhrVar);
    }

    private auhr() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003\u001b\u0004ᐉ\u0002\u0005ᐉ\u0004\u0006ည\u0005\u0007ᐉ\u0003\bᐉ\u0006\tဈ\u0007", new Object[]{"b", "c", "d", "e", augt.class, "f", "k", "h", "g", "l", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new auhr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (auhr.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
