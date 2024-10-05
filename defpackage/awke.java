package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awke extends aonm implements aooz {
    public static final awke a;
    private static volatile aopf e;
    public int b;
    public aoqa c;
    public aoot d = aoot.a;

    static {
        awke awkeVar = new awke();
        a = awkeVar;
        aonm.registerDefaultInstance(awke.class, awkeVar);
    }

    private awke() {
    }

    public final aoot a() {
        aoot aootVar = this.d;
        if (!aootVar.b) {
            this.d = aootVar.a();
        }
        return this.d;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"b", "c", "d", awkd.a});
            case NEW_MUTABLE_INSTANCE:
                return new awke();
            case NEW_BUILDER:
                return new aone((short[][]) null, (boolean[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awke.class) {
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
