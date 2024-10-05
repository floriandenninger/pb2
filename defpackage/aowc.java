package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aowc extends aonm implements aooz {
    public static final aowc a;
    private static volatile aopf i;
    public int b;
    public int d;
    public aoyn h;
    private int j;
    private byte k = 2;
    public aony c = emptyProtobufList();
    public String e = "";
    public aony f = emptyProtobufList();
    public aony g = emptyProtobufList();

    static {
        aowc aowcVar = new aowc();
        a = aowcVar;
        aonm.registerDefaultInstance(aowc.class, aowcVar);
    }

    private aowc() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0003\u0001\u0001ဋ\u0000\u0002Л\u0003ဌ\u0003\u0004ဈ\u0004\u0006\u001b\u0007\u001b\u000eဉ\t", new Object[]{"j", "b", "c", aowd.class, "d", aouo.k, "e", "f", aoye.class, "g", aoye.class, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aowc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aowc.class) {
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
