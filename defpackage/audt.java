package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class audt extends aonm implements aooz {
    public static final audt a;
    public static final aonk b;
    private static volatile aopf e;
    public int c;
    public awos d;
    private byte f = 2;

    static {
        audt audtVar = new audt();
        a = audtVar;
        aonm.registerDefaultInstance(audt.class, audtVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, audtVar, audtVar, null, 202698262, aoqn.MESSAGE, audt.class);
    }

    private audt() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new audt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (audt.class) {
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
