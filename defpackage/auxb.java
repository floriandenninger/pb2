package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auxb extends aonm implements aooz {
    public static final auxb a;
    private static volatile aopf i;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public aqyg f;
    public boolean h;
    private aota j;
    private byte k = 2;
    public aony g = emptyProtobufList();

    static {
        auxb auxbVar = new auxb();
        a = auxbVar;
        aonm.registerDefaultInstance(auxb.class, auxbVar);
    }

    private auxb() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004Л\u0005ဇ\u0006\u0006ᐉ\u0005\u0007ᐉ\u0007", new Object[]{"b", "c", "d", "e", "g", aulq.class, "h", "f", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new auxb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (auxb.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
