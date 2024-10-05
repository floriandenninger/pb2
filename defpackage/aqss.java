package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqss extends aonm implements aooz {
    public static final aqss a;
    public static final aonk b;
    private static volatile aopf i;
    public int c;
    public avgg f;
    public boolean g;
    public boolean h;
    private byte j = 2;
    public String d = "";
    public aony e = aonm.emptyProtobufList();

    static {
        aqss aqssVar = new aqss();
        a = aqssVar;
        aonm.registerDefaultInstance(aqss.class, aqssVar);
        b = aonm.newSingularGeneratedExtension(aqyi.a, aqssVar, aqssVar, null, 152040444, aoqn.MESSAGE, aqss.class);
    }

    private aqss() {
        aonm.emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001a\u0005ᐉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqss();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aqss.class) {
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
