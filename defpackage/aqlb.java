package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqlb extends aonm implements aooz {
    public static final aqlb a;
    private static volatile aopf j;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public aqla f;
    public aulq g;
    public aulq h;
    private aota k;
    private byte l = 2;
    public aomf i = aomf.b;

    static {
        aqlb aqlbVar = new aqlb();
        a = aqlbVar;
        aonm.registerDefaultInstance(aqlb.class, aqlbVar);
    }

    private aqlb() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0007\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0006\u0005ည\u0007\bᐉ\u0003\tᐉ\u0005\nᐉ\u0000", new Object[]{"b", "d", "e", "g", "k", "i", "f", "h", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aqlb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aqlb.class) {
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
