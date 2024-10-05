package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apmh extends aonm implements aooz {
    public static final apmh a;
    private static volatile aopf e;
    public int b;
    public apmg c;
    public apmp d;
    private apmi f;
    private apml g;
    private byte h = 2;

    static {
        apmh apmhVar = new apmh();
        a = apmhVar;
        aonm.registerDefaultInstance(apmh.class, apmhVar);
    }

    private apmh() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ueb11ἑ\uf2c2꒨\u0004\u0000\u0000\u0004\ueb11ἑᐉ\u0000\ue5d8☢ᐉ\u0001\ue110ꈕᐉ\u0003\uf2c2꒨ᐉ\u0004", new Object[]{"b", "c", "d", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apmh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (apmh.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
