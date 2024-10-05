package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpk extends aonm implements aooz {
    public static final atpk a;
    public static final aonk b;
    private static volatile aopf d;
    private byte e = 2;
    public aony c = emptyProtobufList();

    static {
        atpk atpkVar = new atpk();
        a = atpkVar;
        aonm.registerDefaultInstance(atpk.class, atpkVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, atpkVar, atpkVar, null, 289177740, aoqn.MESSAGE, atpk.class);
    }

    private atpk() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"c", atpq.class});
            case NEW_MUTABLE_INSTANCE:
                return new atpk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atpk.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
