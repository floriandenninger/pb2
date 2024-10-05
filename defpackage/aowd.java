package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aowd extends aonm implements aooz {
    public static final aowd a;
    private static volatile aopf i;
    public int b;
    public avvy c;
    public aqxo d;
    public avbm e;
    public aumr f;
    public avwa g;
    public avvx h;
    private asgm j;
    private aoyx k;
    private byte l = 2;

    static {
        aowd aowdVar = new aowd();
        a = aowdVar;
        aonm.registerDefaultInstance(aowd.class, aowdVar);
    }

    private aowd() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001ﵡᵙﲱꌪ\b\u0000\u0000\u0007ﵡᵙᐉ\u0000諾⡱ဉ\u0001\uf09c⢠ᐉ\u0002\ue162⪂ᐉ\u0005\ue879㋶ᐉ\u0003\ueb30堂ᐉ\u0004\ue4bfꋚᐉ\u0006ﲱꌪᐉ\u0007", new Object[]{"b", "c", "d", "e", "k", "j", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aowd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aowd.class) {
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
