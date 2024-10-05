package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atkc extends aonm implements aooz {
    public static final atkc a;
    private static volatile aopf k;
    public int b;
    public atkb c;
    public avgg d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    private aota l;
    private byte m = 2;
    public aony h = emptyProtobufList();
    public aony i = emptyProtobufList();
    public aomf j = aomf.b;

    static {
        atkc atkcVar = new atkc();
        a = atkcVar;
        aonm.registerDefaultInstance(atkc.class, atkcVar);
    }

    private atkc() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0002\u0007\u0001ᐉ\u0004\u0002ᐉ\u0005\u0003ᐉ\u0006\u0004ᐉ\u0007\u0005ᐉ\b\u0006ည\t\u0007Л\bЛ\u000bဉ\u0001", new Object[]{"b", "d", "e", "f", "g", "l", "j", "h", aqyg.class, "i", aqyg.class, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new atkc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (atkc.class) {
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
