package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auty extends aonm implements aooz {
    public static final auty a;
    public static final aonk b;
    private static volatile aopf i;
    public int c;
    public awos d;
    public aqrd e;
    public boolean f;
    public boolean g;
    public awnw h;
    private atgq j;
    private aoot k = aoot.a;
    private byte l = 2;

    static {
        auty autyVar = new auty();
        a = autyVar;
        aonm.registerDefaultInstance(auty.class, autyVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, autyVar, autyVar, null, 221293762, aoqn.MESSAGE, auty.class);
    }

    private auty() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0001\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0005ဇ\u0004\u0006ဉ\u0005\u0007ᐉ\u0006\b2", new Object[]{"c", "d", "e", "f", "g", "j", "h", "k", autx.a});
            case NEW_MUTABLE_INSTANCE:
                return new auty();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (auty.class) {
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
